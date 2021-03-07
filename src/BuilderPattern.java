public class BuilderPattern {

    /* This pattern will be used where multiple parameter are present and we need to make multiple
     * constructor. */

    // 1. Make all variable as final and private so they are immutable

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    // 2. Now make the getter of each attributes
    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    // 3. Make a static inner Builder Class with all the required attributes as private


    public static class Builder{

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;


        public Builder() {
        }


        // Now we are making setter for each attribute and return  type is Builder (this is the main concept here)

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        // 4. Now make the build method which will return the object of main class type
        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }

    // 5. Create private  Constructor with argument of Builder class object

    private BuilderPattern(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

}
