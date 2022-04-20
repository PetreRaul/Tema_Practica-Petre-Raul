public class Motorcycle extends Vehicle{

    private String sidecar;

    public String getSidecar() {
        return sidecar;
    }

    public void setSidecar(String sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle: { sidecar = " + sidecar + ", " + super.toString()
                + "}";
    }

}
