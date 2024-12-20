package com.docstudio.client;


import com.docstudio.client.api.MiscControllerApi;
import com.docstudio.client.model.SettingsDTO;
import org.junit.jupiter.api.Test;

import javax.mail.internet.MimeUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonTest {
    @Test
    void test() throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("https://api.docstudio.com");
        client.setDebugging(false);
        client.setReadTimeout(120000);
        client.setWriteTimeout(120000);

        MiscControllerApi miscControllerApi = new MiscControllerApi(client);
        SettingsDTO settingsDTO = miscControllerApi.appSettings();
        assertEquals("DocStudio", settingsDTO.getApplicationName());
    }

    @Test
    void decodeMime() throws Exception {
        String decoded = MimeUtility.decodeText("=?UTF-8?Q?Invoice_4.png?=");
        assertEquals("Invoice 4.png", decoded);
    }
}
