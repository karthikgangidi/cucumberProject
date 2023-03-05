package org.screenshot.com;

import org.apache.commons.io.FileUtils;
import org.browser.com.Browser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static org.browser.com.Browser.driver;

public class Screenshot1 extends Browser {

        public static void ScreenShot(String name) throws Exception {
            try {
                TakesScreenshot scrShot =((TakesScreenshot)driver);

                File Src=scrShot.getScreenshotAs(OutputType.FILE);

                String filePath = System.getProperty("user.dir")+"//target//Screenshot//"+name+".png";
                File Dest=new File(filePath);
                FileUtils.copyFile(Src, Dest);
            }catch (Exception e)
            {
                System.out.println("Screen Captured");
            }

        }

}
