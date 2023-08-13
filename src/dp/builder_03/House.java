package dp.builder_03;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    public House (Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public Builder() {}

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
