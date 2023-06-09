/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradledevopsproject;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Ascii Render Example
        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(50).height(10);
        builder.element(new PseudoText("DevOps"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);

        // As project has been shown in ASCII code, here a chart plot using JFreeChart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(20, "Student", "Patrick");
        dataset.addValue(28, "Student", "Blendor");
        dataset.addValue(21, "Student", "Michael");
        dataset.addValue(23, "Student", "Veronique");
        dataset.addValue(25, "Student", "Patricia");
        dataset.addValue(19, "Student", "Maria");
        
        // Create a bar chart
        JFreeChart chart = ChartFactory.createBarChart("Students in class", "Names", "Ages", dataset);
        
        // Display the chart in a window
        ChartFrame frame = new ChartFrame("Students Chart", chart);
        frame.pack();
        frame.setVisible(true);

    }
}
