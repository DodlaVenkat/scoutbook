/**
 * 
 */
package org.eclipsescout.contacts.shared.ui.forms;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.ValidationRule;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;
import org.eclipsescout.contacts.shared.services.lookup.CompanyLookupCall;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 * 
 * @generated
 */
@Generated(value = "org.eclipse.scout.sdk.workspace.dto.formdata.FormDataDtoUpdateOperation", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public PersonFormData() {
  }

  public Company getCompany() {
    return getFieldByClass(Company.class);
  }

  public DateOfBirth getDateOfBirth() {
    return getFieldByClass(DateOfBirth.class);
  }

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public Headline getHeadline() {
    return getFieldByClass(Headline.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public Location getLocation() {
    return getFieldByClass(Location.class);
  }

  /**
   * access method for property PersonId.
   */
  public String getPersonId() {
    return getPersonIdProperty().getValue();
  }

  /**
   * access method for property PersonId.
   */
  public void setPersonId(String personId) {
    getPersonIdProperty().setValue(personId);
  }

  public PersonIdProperty getPersonIdProperty() {
    return getPropertyByClass(PersonIdProperty.class);
  }

  /**
   * access method for property PersonNr.
   */
  public Long getPersonNr() {
    return getPersonNrProperty().getValue();
  }

  /**
   * access method for property PersonNr.
   */
  public void setPersonNr(Long personNr) {
    getPersonNrProperty().setValue(personNr);
  }

  public PersonNrProperty getPersonNrProperty() {
    return getPropertyByClass(PersonNrProperty.class);
  }

  public PictureURL getPictureURL() {
    return getFieldByClass(PictureURL.class);
  }

  public static class Company extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Company() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.LOOKUP_CALL, CompanyLookupCall.class);
      ruleMap.put(ValidationRule.ZERO_NULL_EQUALITY, true);
    }
  }

  public static class DateOfBirth extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;

    public DateOfBirth() {
    }
  }

  public static class FirstName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public FirstName() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Headline extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Headline() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class LastName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public LastName() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Location extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Location() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class PersonIdProperty extends AbstractPropertyData<String> {

    private static final long serialVersionUID = 1L;

    public PersonIdProperty() {
    }
  }

  public static class PersonNrProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;

    public PersonNrProperty() {
    }
  }

  public static class PictureURL extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public PictureURL() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }
}
