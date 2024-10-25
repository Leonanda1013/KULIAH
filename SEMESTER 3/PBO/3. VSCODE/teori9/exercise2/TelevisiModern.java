public class TelevisiModern extends Elektronik {
    private String modelInput;

    public TelevisiModern(int voltase, String modelInput) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput() {
        return modelInput;
    }
}
