import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number of the virtual machines : ");
        int vm = sc.nextInt();
        int[][] vmPower = new int[vm][2];
        int[][] timeMatrix = new int[vm][vm];

        System.out.println(" Enter the number of the Tasks : ");
        int tasks = sc.nextInt();
        int[][] tasksDetails = new int[tasks][2];

        System.out.println(" Enter the CPU and MEMORY power of the Virtual Machines : ");
        for (int i = 0; i < vm; i++) {
            System.out.println(" Enter the CPU POWER of : " + i + " th virtual machine : ");
            int CPU = sc.nextInt();

            System.out.println(" Enter the MEMORY POWER of : " + i + " th virtual machine : ");
            int MEMORY = sc.nextInt();

            vmPower[i][0] = CPU;
            vmPower[i][1] = MEMORY;
        }

        System.out.println(" Enter the Task and how much  CPU and MEMORY power  the task uses  : ");
        for (int i = 0; i < tasks; i++) {
            System.out.println(" Enter the CPU POWER of : " + i + " th virtual machine : ");
            int taskCPU = sc.nextInt();

            System.out.println(" Enter the MEMORY POWER of : " + i + " th virtual machine : ");
            int taskMEMORY = sc.nextInt();

            tasksDetails[i][0] = taskCPU;
            tasksDetails[i][1] = taskMEMORY;
        }

        System.out.println(" Enter the time matrix  : ");
        for (int i = 0; i < vm; i++) {
            System.out.println(" Enter the Time matrix for  " + (i + 1) + " th virtual machine : ");

            for (int j = 0; j < vm; j++) {
                System.out.println(" Enter the cost for the task :" + (j + 1) + " :");
                timeMatrix[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < tasks; i++) {
            int currCPU = tasksDetails[i][0];
            int currMEMORY = tasksDetails[i][1];

            int time = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < vm; j++) {
                if (timeMatrix[j][i] < time && vmPower[j][0] >= currCPU && vmPower[j][1] >= currMEMORY) {
                    time = timeMatrix[j][i];
                    index = j;
                }
            }

            if (index != -1) {
                System.out
                        .println(" TASK  " + (i + 1) + " is processed by the virtual machine : " + (index + 1) + " ..");
                vmPower[index][0] -= currCPU;
                vmPower[index][1] -= currMEMORY;
            } else {
                System.out.println(" TASK  " + (i + 1) + " is not processed by any  virtual machine : ");
                break;
            }

        }

    }
}
