
    package org.launchcode;

    public abstract class BaseDisc {
        private String discType;
        private String capacity;
        private String title;
        private String contents;


        public BaseDisc(String discType, String capacity, String title, String contents) {
            this.discType = discType;
            this.capacity = capacity;
            this.title = title;
            this.contents = "";
        }

        public String getDiscType() {
            return discType;
        }

        public void setDiscType(String discType) {
            this.discType = discType;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

    }
}
