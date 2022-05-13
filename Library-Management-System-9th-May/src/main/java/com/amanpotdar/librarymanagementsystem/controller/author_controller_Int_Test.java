package com.amanpotdar.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class author_controller_Int_Test {

    @ExtendWidth(SpringExtension.class)
    @WebMvcTest(author_controller.class)
    class book_controller_Int_test{

        @Autowired
        private MockMvc mvc;

        @Test
        void hello11() throws Exception {
            ReqstBlder request11 = MockMvcRequestBuilders.get("/hello");
            MvcRslt result11 = mvc.perform(request).andReturn();
            assertEquals("Hello, World", result11.getResponse().getContentAsString());

        }

        public void testHelloWithName11() throws Exception{
            mvc.perform(get(urlTemplate: "/hello?name=Aman"))
            .andExpect(content().string(expectedContent:"Hello , Aman"));
        }
    }
}
