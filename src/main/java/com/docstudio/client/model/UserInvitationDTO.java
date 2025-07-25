/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.MailboxProfileDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * UserInvitationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class UserInvitationDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  @javax.annotation.Nullable
  private Boolean system;

  public static final String SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER = "allowMicrosoftOfficeViewer";
  @SerializedName(SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER)
  @javax.annotation.Nullable
  private Boolean allowMicrosoftOfficeViewer;

  public static final String SERIALIZED_NAME_CORPORATE_PROFILE_EDIT_RESTRICTED = "corporateProfileEditRestricted";
  @SerializedName(SERIALIZED_NAME_CORPORATE_PROFILE_EDIT_RESTRICTED)
  @javax.annotation.Nullable
  private Boolean corporateProfileEditRestricted;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  @javax.annotation.Nullable
  private Boolean company;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  @javax.annotation.Nullable
  private Set<Integer> permissions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  @javax.annotation.Nullable
  private List<MailboxProfileDTO> mailboxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_SHARING_PROVIDERS = "documentSharingProviders";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_SHARING_PROVIDERS)
  @javax.annotation.Nullable
  private Set<Object> documentSharingProviders = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private String code;

  public UserInvitationDTO() {
  }

  public UserInvitationDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Account UUID
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public UserInvitationDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Account Name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public UserInvitationDTO system(@javax.annotation.Nullable Boolean system) {
    this.system = system;
    return this;
  }

  /**
   * Get system
   * @return system
   */
  @javax.annotation.Nullable
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(@javax.annotation.Nullable Boolean system) {
    this.system = system;
  }


  public UserInvitationDTO allowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
    return this;
  }

  /**
   * Allow envelope attachments public access for MS Office Viewer
   * @return allowMicrosoftOfficeViewer
   */
  @javax.annotation.Nullable
  public Boolean getAllowMicrosoftOfficeViewer() {
    return allowMicrosoftOfficeViewer;
  }

  public void setAllowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
  }


  public UserInvitationDTO corporateProfileEditRestricted(@javax.annotation.Nullable Boolean corporateProfileEditRestricted) {
    this.corporateProfileEditRestricted = corporateProfileEditRestricted;
    return this;
  }

  /**
   * Is profile editing restricted for corporate users?
   * @return corporateProfileEditRestricted
   */
  @javax.annotation.Nullable
  public Boolean getCorporateProfileEditRestricted() {
    return corporateProfileEditRestricted;
  }

  public void setCorporateProfileEditRestricted(@javax.annotation.Nullable Boolean corporateProfileEditRestricted) {
    this.corporateProfileEditRestricted = corporateProfileEditRestricted;
  }


  public UserInvitationDTO company(@javax.annotation.Nullable Boolean company) {
    this.company = company;
    return this;
  }

  /**
   * Is account registered as a company?
   * @return company
   */
  @javax.annotation.Nullable
  public Boolean getCompany() {
    return company;
  }

  public void setCompany(@javax.annotation.Nullable Boolean company) {
    this.company = company;
  }


  public UserInvitationDTO permissions(@javax.annotation.Nullable Set<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserInvitationDTO addPermissionsItem(Integer permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new LinkedHashSet<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permissions for current user
   * @return permissions
   */
  @javax.annotation.Nullable
  public Set<Integer> getPermissions() {
    return permissions;
  }

  public void setPermissions(@javax.annotation.Nullable Set<Integer> permissions) {
    this.permissions = permissions;
  }


  public UserInvitationDTO mailboxes(@javax.annotation.Nullable List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public UserInvitationDTO addMailboxesItem(MailboxProfileDTO mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

  /**
   * Mailboxes linked to this account
   * @return mailboxes
   */
  @javax.annotation.Nullable
  public List<MailboxProfileDTO> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(@javax.annotation.Nullable List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
  }


  public UserInvitationDTO documentSharingProviders(@javax.annotation.Nullable Set<Object> documentSharingProviders) {
    this.documentSharingProviders = documentSharingProviders;
    return this;
  }

  public UserInvitationDTO addDocumentSharingProvidersItem(Object documentSharingProvidersItem) {
    if (this.documentSharingProviders == null) {
      this.documentSharingProviders = new LinkedHashSet<>();
    }
    this.documentSharingProviders.add(documentSharingProvidersItem);
    return this;
  }

  /**
   * Get documentSharingProviders
   * @return documentSharingProviders
   */
  @javax.annotation.Nullable
  public Set<Object> getDocumentSharingProviders() {
    return documentSharingProviders;
  }

  public void setDocumentSharingProviders(@javax.annotation.Nullable Set<Object> documentSharingProviders) {
    this.documentSharingProviders = documentSharingProviders;
  }


  public UserInvitationDTO code(@javax.annotation.Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Invitation code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UserInvitationDTO instance itself
   */
  public UserInvitationDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationDTO userInvitationDTO = (UserInvitationDTO) o;
    return Objects.equals(this.uuid, userInvitationDTO.uuid) &&
        Objects.equals(this.name, userInvitationDTO.name) &&
        Objects.equals(this.system, userInvitationDTO.system) &&
        Objects.equals(this.allowMicrosoftOfficeViewer, userInvitationDTO.allowMicrosoftOfficeViewer) &&
        Objects.equals(this.corporateProfileEditRestricted, userInvitationDTO.corporateProfileEditRestricted) &&
        Objects.equals(this.company, userInvitationDTO.company) &&
        Objects.equals(this.permissions, userInvitationDTO.permissions) &&
        Objects.equals(this.mailboxes, userInvitationDTO.mailboxes) &&
        Objects.equals(this.documentSharingProviders, userInvitationDTO.documentSharingProviders) &&
        Objects.equals(this.code, userInvitationDTO.code)&&
        Objects.equals(this.additionalProperties, userInvitationDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, system, allowMicrosoftOfficeViewer, corporateProfileEditRestricted, company, permissions, mailboxes, documentSharingProviders, code, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    allowMicrosoftOfficeViewer: ").append(toIndentedString(allowMicrosoftOfficeViewer)).append("\n");
    sb.append("    corporateProfileEditRestricted: ").append(toIndentedString(corporateProfileEditRestricted)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    documentSharingProviders: ").append(toIndentedString(documentSharingProviders)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>(Arrays.asList("uuid", "name", "system", "allowMicrosoftOfficeViewer", "corporateProfileEditRestricted", "company", "permissions", "mailboxes", "documentSharingProviders", "code"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserInvitationDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserInvitationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserInvitationDTO is not found in the empty JSON string", UserInvitationDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull() && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      if (jsonObj.get("mailboxes") != null && !jsonObj.get("mailboxes").isJsonNull()) {
        JsonArray jsonArraymailboxes = jsonObj.getAsJsonArray("mailboxes");
        if (jsonArraymailboxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mailboxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxes").toString()));
          }

          // validate the optional field `mailboxes` (array)
          for (int i = 0; i < jsonArraymailboxes.size(); i++) {
            MailboxProfileDTO.validateJsonElement(jsonArraymailboxes.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("documentSharingProviders") != null && !jsonObj.get("documentSharingProviders").isJsonNull() && !jsonObj.get("documentSharingProviders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentSharingProviders` to be an array in the JSON string but got `%s`", jsonObj.get("documentSharingProviders").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserInvitationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserInvitationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserInvitationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserInvitationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UserInvitationDTO>() {
           @Override
           public void write(JsonWriter out, UserInvitationDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UserInvitationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UserInvitationDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserInvitationDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserInvitationDTO
   * @throws IOException if the JSON string is invalid with respect to UserInvitationDTO
   */
  public static UserInvitationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserInvitationDTO.class);
  }

  /**
   * Convert an instance of UserInvitationDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

