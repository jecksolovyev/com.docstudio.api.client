/*
 * Docstudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import java.io.File;
import io.swagger.client.model.InvitationPostDTO;
import io.swagger.client.model.InvitationPutDTO;
import io.swagger.client.model.PageDTOUserInvitationDTO;
import io.swagger.client.model.ProfileDTO;
import io.swagger.client.model.SingleUuidDTO;
import java.util.UUID;
import io.swagger.client.model.UpdatePasswordDTO;
import io.swagger.client.model.UpdateProfileDTO;
import io.swagger.client.model.UserDTO;
import io.swagger.client.model.UserInfoDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserControllerApi
 */
@Ignore
public class UserControllerApiTest {

    private final UserControllerApi api = new UserControllerApi();

    /**
     * Accept invite
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void acceptInviteTest() throws Exception {
        String inviteCode = null;
        api.acceptInvite(inviteCode);

        // TODO: test validations
    }
    /**
     * Update user&#x27;s password
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void changePasswordTest() throws Exception {
        UpdatePasswordDTO body = null;
        api.changePassword(body);

        // TODO: test validations
    }
    /**
     * Update user&#x27;s eink signature in base64 format
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void changeSignatureTest() throws Exception {
        String body = null;
        api.changeSignature(body);

        // TODO: test validations
    }
    /**
     * Create invitation to join account or mailbox with defined permissions.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createInvitationTest() throws Exception {
        InvitationPostDTO body = null;
        SingleUuidDTO response = api.createInvitation(body);

        // TODO: test validations
    }
    /**
     * Decline invite
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void declineInviteTest() throws Exception {
        String inviteCode = null;
        api.declineInvite(inviteCode);

        // TODO: test validations
    }
    /**
     * Delete user himself
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws Exception {
        String checkMessage = null;
        Boolean leaveExisting = null;
        api.deleteUser(checkMessage, leaveExisting);

        // TODO: test validations
    }
    /**
     * Find user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findUserTest() throws Exception {
        String keyword = null;
        UUID exclude = null;
        List<UserDTO> response = api.findUser(keyword, exclude);

        // TODO: test validations
    }
    /**
     * Retrieve user avatar
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAvatarTest() throws Exception {
        UUID userUuid = null;
        Boolean initials = null;
        File response = api.getAvatar(userUuid, initials);

        // TODO: test validations
    }
    /**
     * Get paged invites list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInvitesTest() throws Exception {
        Integer offset = null;
        Integer limit = null;
        PageDTOUserInvitationDTO response = api.getInvites(offset, limit);

        // TODO: test validations
    }
    /**
     * Retrieve users info
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMailboxesInfoTest() throws Exception {
        List<UUID> body = null;
        Map<String, UserInfoDTO> response = api.getMailboxesInfo(body);

        // TODO: test validations
    }
    /**
     * Retrieve user profile
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileTest() throws Exception {
        ProfileDTO response = api.getProfile();

        // TODO: test validations
    }
    /**
     * Update invitation by userUuid.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateInvitationTest() throws Exception {
        InvitationPutDTO body = null;
        UUID uuid = null;
        api.updateInvitation(body, uuid);

        // TODO: test validations
    }
    /**
     * Update user&#x27;s profile
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProfileTest() throws Exception {
        UpdateProfileDTO body = null;
        ProfileDTO response = api.updateProfile(body);

        // TODO: test validations
    }
}
