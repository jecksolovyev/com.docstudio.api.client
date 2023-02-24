/*
 * Centredo Api Documentation
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

import io.swagger.client.model.CategoryDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CategoryControllerApi
 */
@Ignore
public class CategoryControllerApiTest {

    private final CategoryControllerApi api = new CategoryControllerApi();

    /**
     * Save a category in DB
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCategoryTest() throws Exception {
        CategoryDTO body = null;
        UUID mailbox = null;
        CategoryDTO response = api.createCategory(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete category by Id
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws Exception {
        Long id = null;
        UUID mailbox = null;
        Long moveTo = null;
        api.deleteCategory(id, mailbox, moveTo);

        // TODO: test validations
    }
    /**
     * Retrieve all categories by id of specified &#x27;access&#x27; type
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllByTypeTest() throws Exception {
        String access = null;
        UUID mailbox = null;
        List<CategoryDTO> response = api.getAllByType(access, mailbox);

        // TODO: test validations
    }
    /**
     * Update the category in DB
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws Exception {
        CategoryDTO body = null;
        UUID mailbox = null;
        Long id = null;
        CategoryDTO response = api.updateCategory(body, mailbox, id);

        // TODO: test validations
    }
}
