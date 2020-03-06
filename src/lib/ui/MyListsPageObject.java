package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MyListsPageObject extends MainPageObject{

    public static final String
            FOLDER_BY_NAME_TPL = "xpath://*[@text ='{FOLDER_NAME}']",
            ARTICLE_BY_TITLE_TPL = "xpath://*[@text ='{TITLE}']",
            ARTICLE_TITLE_IN_LIST = "xpath://*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text='{TITLE_TEXT}']";

    /*TEMPLATES METHODS*/
    private static String getFolderXpathByName(String name_of_folder)
    {
        return FOLDER_BY_NAME_TPL.replace("{FOLDER_NAME}", name_of_folder);
    }
    private static String getSaveArticleXpathByTitle(String article_title)
    {
        return ARTICLE_BY_TITLE_TPL.replace("{TITLE}", article_title);
    }
    private static String getArticleTitleXpathByName(String title_article_in_list)
    {
        return ARTICLE_TITLE_IN_LIST.replace("{TITLE_TEXT}", title_article_in_list);
    }
    /*TEMPLATES METHODS*/

    public MyListsPageObject(AppiumDriver driver) {
        super(driver);
    }
    public void openFolderByName(String name_of_folder)
    {
        String folder_name_xpath = getFolderXpathByName(name_of_folder);
        this.waitForElementAndClick(
                folder_name_xpath,
                "Cannot find folder by name"+ name_of_folder,
                5
        );
    }
    public void waitForArticleToAppearByTitle(String article_title)
    {
        String article_xpath = getSaveArticleXpathByTitle(article_title);
        this.waitForElementPresent(article_xpath, "Cannot find save article by title" + article_title, 15);
    }

    public void waitForArticleToDisappearByTitle(String article_title)
    {
        String article_xpath = getSaveArticleXpathByTitle(article_title);
        this.waitForElementNotPresent(article_xpath, "Saved article still present with title" + article_title, 15);
    }
    public void swipeByArticleToDelete(String article_title)
    {
        this.waitForArticleToAppearByTitle(article_title);
        String article_xpath =  getSaveArticleXpathByTitle(article_title);
        this.swipedElementToLeft(
                article_xpath,
                "Cannot delete saved article"
        );
        this.waitForArticleToDisappearByTitle(article_title);
    }
    public void checkArticleTitleInMyListAndClick(String title_article_in_list)
    {
        String title_article_in_list_xpath = getArticleTitleXpathByName(title_article_in_list);
        this. waitForElementAndClick(title_article_in_list_xpath,"Cannot find title article in list " + title_article_in_list_xpath,5);

    }
}
