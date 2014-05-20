package org.eclipse.scout.widget.ui.swt.application.menu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.ui.swt.ISwtEnvironment;
import org.eclipse.scout.rt.ui.swt.action.SwtScoutMenuContributionItem;
import org.eclipse.scout.widget.ui.swt.Activator;
import org.eclipse.ui.actions.CompoundContributionItem;

public class DesktopMenuBar extends CompoundContributionItem {

  @Override
  protected IContributionItem[] getContributionItems() {
    ISwtEnvironment env = Activator.getDefault().getEnvironment();
    if (env != null && env.isInitialized()) {
      if (env.getClientSession() != null && env.getClientSession().getDesktop() != null) {
        List<IMenu> menus = env.getClientSession().getDesktop().getMenus();
        // TODO: [M7] reenable line below with Luna M7, delete consolidatedMenus = menus;
        //List<IMenu> consolidatedMenus = MenuUtility.consolidateMenus(menus);
        List<IMenu> consolidatedMenus = menus;
        List<IContributionItem> swtContributionItems = new ArrayList<IContributionItem>();
        for (IMenu menu : consolidatedMenus) {
          swtContributionItems.add(new SwtScoutMenuContributionItem(menu, env));
        }
        return swtContributionItems.toArray(new IContributionItem[swtContributionItems.size()]);
      }
    }
    return new IContributionItem[0];
  }

  @Override
  public boolean isDirty() {
    boolean isDirty = super.isDirty();
    if (!isDirty && getParent() instanceof IMenuManager) {
      isDirty = ((IMenuManager) getParent()).isDirty();
    }
    return isDirty;
  }
}