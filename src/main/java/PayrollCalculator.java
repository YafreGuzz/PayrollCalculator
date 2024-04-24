import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PayrollCalculator
{
    public static void main(String[] args)
    {

        try
        {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;

            while((input = bufReader.readLine()) != null)
            {
                String[] barIndex = input.split(Pattern.quote("|"));
                int id = Integer.parseInt(barIndex[0]);
                String name = barIndex[1];
                double hrsWorked = Double.parseDouble(barIndex[2]);
                double payRate = Double.parseDouble(barIndex[3]);

                Employee EmployeeInfo = new Employee(id, name, hrsWorked, payRate);

                double grossPay = EmployeeInfo.getGrossPay(hrsWorked, payRate);

                System.out.printf("Employee ID: %d Name: %s GrossPay: %s \n", id, name, grossPay);

            }

            bufReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
