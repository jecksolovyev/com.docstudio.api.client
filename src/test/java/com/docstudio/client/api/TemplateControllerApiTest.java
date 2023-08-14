/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import java.io.File;
import com.docstudio.client.model.FullTemplateResponseDTO;
import com.docstudio.client.model.NewTemplateZipStructureDTO;
import com.docstudio.client.model.PageDTODataMap;
import com.docstudio.client.model.PageDTOSearchTemplateDTO;
import com.docstudio.client.model.RecentlyUsedTemplateResponseDTO;
import com.docstudio.client.model.RecommendedTemplateResponseDTO;
import com.docstudio.client.model.SharedCodeDTO;
import com.docstudio.client.model.TemplateCreateDTO;
import com.docstudio.client.model.TemplateValidateResponseDTO;
import com.docstudio.client.model.TemplateZipStructureDTO;
import com.docstudio.client.model.TemplateZipStructureTitlesDTO;
import java.util.UUID;
import com.docstudio.client.model.UploadedImageDTO;
import com.docstudio.client.model.UploadedPdfDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.List;


/**
 * API tests for TemplateControllerApi
 */
@Ignore
public class TemplateControllerApiTest {

    private final TemplateControllerApi api = new TemplateControllerApi();

    /**
     * Add new files structure for zip archive
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addZipStructureTest() throws Exception {
        NewTemplateZipStructureDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        UUID templateVersion = null;
        api.addZipStructure(body, mailbox, uuid, templateVersion);

        // TODO: test validations
    }
    /**
     * Make template archived
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void archiveTemplateTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        api.archiveTemplate(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Check template exists by UUID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void checkTemplateExistsByUuidTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        api.checkTemplateExistsByUuid(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Clone template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cloneTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        FullTemplateResponseDTO response = api.clone(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Create new template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTest() throws Exception {
        TemplateCreateDTO body = null;
        UUID mailbox = null;
        FullTemplateResponseDTO response = api.create(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete share code for template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteShareCodeTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        api.deleteShareCode(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Delete structure for zip archive
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteZipStructureTest() throws Exception {
        UUID uuid = null;
        String title = null;
        UUID mailbox = null;
        UUID templateVersion = null;
        api.deleteZipStructure(uuid, title, mailbox, templateVersion);

        // TODO: test validations
    }
    /**
     * Download template image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadTemplateImageTest() throws Exception {
        UUID uuid = null;
        UUID imageUuid = null;
        UUID mailbox = null;
        UUID envelopeUuid = null;
        List<byte[]> response = api.downloadTemplateImage(uuid, imageUuid, mailbox, envelopeUuid);

        // TODO: test validations
    }
    /**
     * Download template PDF
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadTemplatePdfTest() throws Exception {
        UUID uuid = null;
        UUID pdfUuid = null;
        UUID mailbox = null;
        UUID envelopeUuid = null;
        List<byte[]> response = api.downloadTemplatePdf(uuid, pdfUuid, mailbox, envelopeUuid);

        // TODO: test validations
    }
    /**
     * Get up to 10 recently used templates
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRecentlyUsedTemplatesTest() throws Exception {
        UUID mailbox = null;
        List<RecentlyUsedTemplateResponseDTO> response = api.getRecentlyUsedTemplates(mailbox);

        // TODO: test validations
    }
    /**
     * Get up to 4 recommended templates
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRecommendedTemplatesTest() throws Exception {
        List<RecommendedTemplateResponseDTO> response = api.getRecommendedTemplates();

        // TODO: test validations
    }
    /**
     * Get saved structure titles for zip archive
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSavedZipStructureNamesTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        UUID templateVersion = null;
        TemplateZipStructureTitlesDTO response = api.getSavedZipStructureNames(uuid, mailbox, templateVersion);

        // TODO: test validations
    }
    /**
     * Retrieve share code for template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getShareCodeTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        Boolean generate = null;
        SharedCodeDTO response = api.getShareCode(uuid, mailbox, generate);

        // TODO: test validations
    }
    /**
     * Retrieve template by share code
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateByShareCodeTest() throws Exception {
        String code = null;
        FullTemplateResponseDTO response = api.getTemplateByShareCode(code);

        // TODO: test validations
    }
    /**
     * Retrieve template by UUID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateByUuidTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        UUID templateVersion = null;
        FullTemplateResponseDTO response = api.getTemplateByUuid(uuid, mailbox, templateVersion);

        // TODO: test validations
    }
    /**
     * Retrieve template versions by UUID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateVersionsByUuidTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        Integer offset = null;
        Integer limit = null;
        UUID versionUuid = null;
        PageDTODataMap response = api.getTemplateVersionsByUuid(uuid, mailbox, offset, limit, versionUuid);

        // TODO: test validations
    }
    /**
     * Get structure with all files for zip archive
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getZipStructureTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        UUID templateVersion = null;
        String title = null;
        TemplateZipStructureDTO response = api.getZipStructure(uuid, mailbox, templateVersion, title);

        // TODO: test validations
    }
    /**
     * Get paged templates list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchTemplatesTest() throws Exception {
        UUID mailbox = null;
        String level = null;
        String keyword = null;
        Long category = null;
        Boolean extended = null;
        Integer offset = null;
        Integer limit = null;
        PageDTOSearchTemplateDTO response = api.searchTemplates(mailbox, level, keyword, category, extended, offset, limit);

        // TODO: test validations
    }
    /**
     * Update template in DB. Category in template could be null.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws Exception {
        TemplateCreateDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        FullTemplateResponseDTO response = api.update(body, mailbox, uuid);

        // TODO: test validations
    }
    /**
     * Update categories in template.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCategoriesTest() throws Exception {
        List<Long> body = null;
        UUID mailbox = null;
        UUID uuid = null;
        api.updateCategories(body, mailbox, uuid);

        // TODO: test validations
    }
    /**
     * Update name in template.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateNameTest() throws Exception {
        String body = null;
        UUID mailbox = null;
        UUID uuid = null;
        api.updateName(body, mailbox, uuid);

        // TODO: test validations
    }
    /**
     * Upload new image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadImageTest() throws Exception {
        UUID mailbox = null;
        File file = null;
        UploadedImageDTO response = api.uploadImage(mailbox, file);

        // TODO: test validations
    }
    /**
     * Upload new PDF
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadPdfTest() throws Exception {
        UUID mailbox = null;
        File file = null;
        UploadedPdfDTO response = api.uploadPdf(mailbox, file);

        // TODO: test validations
    }
    /**
     * Validate template by UUID or version
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void validateTemplateTest() throws Exception {
        UUID mailbox = null;
        UUID templateUuid = null;
        UUID versionUuid = null;
        TemplateValidateResponseDTO response = api.validateTemplate(mailbox, templateUuid, versionUuid);

        // TODO: test validations
    }
}
