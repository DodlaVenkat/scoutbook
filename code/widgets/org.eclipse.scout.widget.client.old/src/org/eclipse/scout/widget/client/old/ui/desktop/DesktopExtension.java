package org.eclipse.scout.widget.client.old.ui.desktop;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.commons.annotations.Order;
import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.rt.client.ui.desktop.AbstractDesktopExtension;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractFormToolButton;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutlineViewButton;
import org.eclipse.scout.rt.client.ui.desktop.outline.IOutline;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.widget.client.old.ui.desktop.outlines.PagesSearchFormsOutline;
import org.eclipse.scout.widget.client.old.ui.desktop.outlines.WidgetsOutline;
import org.eclipse.scout.widget.client.old.ui.forms.ToolButton1Form;
import org.eclipse.scout.widget.client.old.ui.forms.ToolButton2Form;
import org.eclipse.scout.widget.shared.Icons;

public class DesktopExtension extends AbstractDesktopExtension {
  public DesktopExtension() {
  }

  @Override
  protected List<Class<? extends IOutline>> getConfiguredOutlines() {
    List<Class<? extends IOutline>> outlines = new ArrayList<Class<? extends IOutline>>();
    outlines.add(WidgetsOutline.class);
    outlines.add(PagesSearchFormsOutline.class);
    return outlines;
  }

  @Order(10.0)
  public class WidgetsOutlineViewButton extends AbstractOutlineViewButton {

    /**
     *
     */
    public WidgetsOutlineViewButton() {
      super(getCoreDesktop(), WidgetsOutline.class);
    }
  }

  @Order(20.0)
  public class PagesSearchFormsOutlineViewButton extends AbstractOutlineViewButton {

    /**
     *
     */
    public PagesSearchFormsOutlineViewButton() {
      super(getCoreDesktop(), PagesSearchFormsOutline.class);
    }
  }

  @Order(10.0)
  public class ToolButton1Tool extends AbstractFormToolButton<ToolButton1Form> {

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("ToolButton1");
    }

    @Override
    protected String getConfiguredIconId() {
      return Icons.StarYellow;
    }

    @Override
    protected void execAction() throws ProcessingException {
      ToolButton1Form form = new ToolButton1Form();
      decorateForm(form);
      form.startTool();
      setForm(form);
    }
  }

  @Order(20.0)
  public class ToolButton2Tool extends AbstractFormToolButton<ToolButton2Form> {

    @Override
    protected String getConfiguredIconId() {
      return Icons.StarRed;
    }

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("ToolButton2");
    }

    @Override
    protected void execAction() throws ProcessingException {
      ToolButton2Form form = new ToolButton2Form();
      decorateForm(form);
      form.startTool();
      setForm(form);
    }
  }
}
