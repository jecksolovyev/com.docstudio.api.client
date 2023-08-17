/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.PermissionsDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for PermissionMailboxControllerApi
 */
@Ignore
public class PermissionMailboxControllerApiTest {

    private final PermissionMailboxControllerApi api = new PermissionMailboxControllerApi();

    /**
     * Delete all permissions and roles for selected user-to-mailbox relation
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAllPermissionsTest() throws Exception {
        UUID userUuid = null;
        UUID mailboxUuid = null;
        api.deleteAllPermissions(userUuid, mailboxUuid);

        // TODO: test validations
    }
    /**
     * Delete permission for specific user-to-mailbox relation
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePermissionTest() throws Exception {
        UUID userUuid = null;
        UUID mailboxUuid = null;
        Integer permissionId = null;
        api.deletePermission(userUuid, mailboxUuid, permissionId);

        // TODO: test validations
    }
    /**
     * Delete role
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRoleFromMailboxTest() throws Exception {
        UUID userUuid = null;
        UUID mailboxUuid = null;
        UUID roleUuid = null;
        api.deleteRoleFromMailbox(userUuid, mailboxUuid, roleUuid);

        // TODO: test validations
    }
    /**
     * Add exact permissions/roles leaving existing as is. Ignore if already present.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchMbPermissionsTest() throws Exception {
        PermissionsDTO body = null;
        UUID userUuid = null;
        UUID mailboxUuid = null;
        api.patchMbPermissions(body, userUuid, mailboxUuid);

        // TODO: test validations
    }
    /**
     * Replace all permissions for selected user-to-mailbox relation
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void replaceAllPermissionsTest() throws Exception {
        PermissionsDTO body = null;
        UUID userUuid = null;
        UUID mailboxUuid = null;
        api.replaceAllPermissions(body, userUuid, mailboxUuid);

        // TODO: test validations
    }
}
