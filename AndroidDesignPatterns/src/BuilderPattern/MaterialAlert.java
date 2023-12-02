package BuilderPattern;

public class MaterialAlert {
    // <!--------------- Optional parameters --------------->
    private  Boolean title = false;
    private  Boolean message = false;
    // <!--------------- Optional parameters --------------->

    // <!--------------- Compulsory parameters --------------->
    private  String positiveButtonText;
    private  String negativeButtonText;

    private MaterialAlert(Builder builder) {
        this.positiveButtonText = builder.positiveButtonText;
        this.negativeButtonText = builder.negativeButtonText;
        this.title = builder.isTitleVisible;
        this.message = builder.isMessageVisible;
    }
    // <!--------------- Compulsory parameters --------------->

    public void setTitle(Boolean title) { this.title = title; }

    public void setMessage(Boolean message) { this.message = message; }

    public void setPositiveButtonText(String text) { this.positiveButtonText = text; }

    public void setNegativeButtonText(String text) { this.negativeButtonText = text; }


    // Builder class
    public static class Builder {

        // <!--------------- Optional parameters --------------->
        private  Boolean isTitleVisible = false;
        private  Boolean isMessageVisible = false;
        // <!--------------- Optional parameters --------------->

        // <!--------------- Compulsory parameters --------------->
        private final String positiveButtonText;
        private final String negativeButtonText;
        // <!--------------- Compulsory parameters --------------->

        // Compulsory params are set in constructor of builder
        public Builder(String positiveButtonText, String negativeButtonText){
            this.positiveButtonText = positiveButtonText;
            this.negativeButtonText = negativeButtonText;
        }

        /** ************* Set optional params to builder ************* **/
        public Builder setTitleVisible(Boolean isTitleVisible){
            // Modify the params and return the same instance of class
            this.isTitleVisible = isTitleVisible;
            return this;
        }

        public Builder setMessageVisible(Boolean isMessageVisible){
            // Modify the params and return the same instance of class
            this.isMessageVisible = isMessageVisible;
            return this;
        }
        /** ************* Set optional params to builder ************* **/

        public MaterialAlert build() {
            return new MaterialAlert(this);
        }
    }
}