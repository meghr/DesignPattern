package factoryPattern;

// This class will be available for user

public class WebsiteFactory {

    public static Website getWebsite(String siteType) {

        switch (siteType) {
            case "blog": {
                return new Blog();
            }

            case "shop": {
                return new Shop();
            }

            default:
            {
                return null;
            }
        }
    }

}

