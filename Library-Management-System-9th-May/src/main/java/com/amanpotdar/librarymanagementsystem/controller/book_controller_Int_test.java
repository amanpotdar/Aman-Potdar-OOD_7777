package com.amanpotdar.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class author_controller_Int_Test {

    @ExtendWidth(SpringExtension.class)
    @WebMvcTest(book_controller.class)
    class book_controller_Int_test{

        @Autowired
        private MockMvc mvc;

        @Test
        void hello22() throws Exception {
            ReqstBlder request22 = MockMvcRequestBuilders.get("/hello");
            MvcRslt result22 = mvc.perform(request).andReturn();
            assertEquals("Hello, World", result11.getResponse().getContentAsString());

        }

        public void testHelloWithName22() throws Exception{
            mvc.perform(get(urlTemplate: "/hello?name=Aman"))
            .andExpect(content().string(expectedContent:"Hello , Aman"));
        }
    }
}
