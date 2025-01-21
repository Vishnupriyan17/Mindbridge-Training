package Day15.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Average {

        public static double calculateAverageGPA(List<Double> gpas) {
            double[] sum = {0};
            int[] count = {0};

            gpas.forEach(gpa -> {
                sum[0] += gpa;
                count[0]++;
            });

            return count[0] > 0 ? sum[0] / count[0] : 0;
        }

        public static void main(String[] args) {
            List<Double> studentGPAs = List.of(3.5, 3.8, 4.0, 2.9);
            double averageGPA = calculateAverageGPA(studentGPAs);
            System.out.println("Average GPA: " + averageGPA);
        }
    }

