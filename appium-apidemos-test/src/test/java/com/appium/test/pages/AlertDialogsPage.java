package com.appium.test.pages;

import com.appium.framework.base.PageObjectConstruct;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSFindAll;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("cucumber-glue")
public class AlertDialogsPage extends PageObjectConstruct {

    @AndroidFindBy(id = "button1")
    @iOSFindBy(id = "some_ios_id_button_1")
    public MobileElement BUTTON_1;
    @AndroidFindBy(id = "checkbox_button")
    @iOSFindBy(id = "some_ios_id_checkbox_button")
    public MobileElement CHECKBOX_BUTTON;
    @AndroidFindAll({@AndroidBy(id = "text1")})
    @iOSFindAll({@iOSBy(id = "some_ios_id_text1")})
    public List<MobileElement> L_TEXT_1;

}
