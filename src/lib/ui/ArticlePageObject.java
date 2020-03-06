//package lib.ui;
//
//import io.appium.java_client.AppiumDriver;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class ArticlePageObject extends MainPageObject {
//
//    private static final String
//        TITLE = "id:org.wikipedia:id/view_page_title_text",
//        FOOTER_ELEMENT = "xpath://*[@text='View page in browser']",
//        OPTION_BUTTON = "xpath://android.widget.ImageView[@content-desc='More options']",
//        OPTIONS_AND_TO_MY_LIST_BUTTON = "xpath://*[@text='Add to reading list']",
//        ADD_TO_MY_LIST_OVERLAY = "id:org.wikipedia:id/onboarding_button",
//        MY_LIST_NAME_INPUT = "id:org.wikipedia:id/text_input",
//        MY_LIST_OK_BUTTON = "xpath://*[@text ='OK']",
//        CLOSE_ARTICLE_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']",
//        TITLE_IN_ARTICLE = "xpath://android.widget.TextView[@resource-id=\"org.wikipedia:id/view_page_title_text\"]",
//        MY_LIST_NAME_TPL = "xpath://*[@resource-id='org.wikipedia:id/item_container']//*[@text='{LIST_NAME}']";
//
//
//
//    public ArticlePageObject(AppiumDriver driver)
//    {
//        super(driver);
//    }
//
//    /*TEMPLATES METHODS*/
//    private static String getFolderXpathByName(String name_of_folder)
//    {
//        return MY_LIST_NAME_TPL.replace("{LIST_NAME}", name_of_folder);
//    }
//
//
//    /*TEMPLATES METHODS*/
//
//
//    public WebElement waitForTitleElement()
//    {
//        return this.waitForElementPresent(TITLE, "Cannot find article title on page", 15);
//    }
//    public String  getArticleTitle()
//    {
//        WebElement title_element = waitForTitleElement();
//        return title_element.getAttribute("text");
//    }
//    public void swipeToFooter()
//    {
//        this.swipeUpToFindElement(
//                FOOTER_ELEMENT,
//                "Cannot find the end of article",
//                20
//        );
//    }
//    public void addArticleToMyList(String name_of_folder) throws InterruptedException
//    {
//        this.waitForElementAndClick(
//                OPTION_BUTTON,
//                "Cannot find button to open article option",
//                5
//        );
//        Thread.sleep(2000);
//        this.waitForElementAndClick(
//                OPTIONS_AND_TO_MY_LIST_BUTTON,
//                "Cannot find option to add article to reading list",
//                2
//        );
//        this.waitForElementAndClick(
//                ADD_TO_MY_LIST_OVERLAY,
//                "Cannot find 'got it' tip overlay",
//                5
//        );
//        this.waitForElementForClear(
//                MY_LIST_NAME_INPUT,
//                "Cannot find input to set name of articles folder",
//                5
//        );
//
//        this.waitForElementAndSendKeys(
//                MY_LIST_NAME_INPUT,
//                name_of_folder,
//                "Cannot put text into articles to reading list",
//                5
//        );
//        this.waitForElementAndClick(
//                MY_LIST_OK_BUTTON,
//                "Cannot press OK button",
//                5
//        );
//    }
//    public void closeArticle()
//    {
//        this.waitForElementAndClick(
//                CLOSE_ARTICLE_BUTTON,
//                "Cannot close article, cannot find X link",
//                5
//        );
//    }
//    public void presentTitleInArticle()
//    {
//        this.assertElementPresent(
//                TITLE_IN_ARTICLE,
//                "No title on screen article. Number of titles: ");
//    }
//    public void addNewArticleToMyList(String name_of_folder ) throws InterruptedException {
//        waitForElementAndClick(
//                OPTION_BUTTON,
//                "Cannot find button to open article option",
//                5
//        );
//        Thread.sleep(2000);
//        waitForElementAndClick(
//                OPTIONS_AND_TO_MY_LIST_BUTTON,
//                "Cannot find option to add article to reading list",
//                5
//        );
//        Thread.sleep(2000);
//        String folder_name_xpath = getFolderXpathByName(name_of_folder);
//        waitForElementAndClick(
//                folder_name_xpath,
//                "Cannot find search string",
//                10
//        );
//
//    }
//
//}
