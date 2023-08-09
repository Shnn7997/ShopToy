public class Main {
    public static void main(String[] args) {
        ToyCatalogModel model = new ToyCatalogModel();
        ToyCatalogView view = new ToyCatalogView();
        ToyCatalogController controller = new ToyCatalogController(model, view);

        controller.run();
    }
}