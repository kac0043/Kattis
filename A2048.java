import java.util.*;

public class A2048
{
        public static void main(String[] arg) 
        {
                Scanner scan = new Scanner(System.in);
                int[][] nums = new int[4][4];
                for (int i = 0; i < 4; i++)
                        for (int j = 0; j < 4; j++)
                                nums[i][j] = scan.nextInt();
                int direction = scan.nextInt();
                if (direction == 0)
                {
                        for (int i = 0; i < 4; i++)
                                for (int j = 3; j > 0; j--)
                                {
                                        if (nums[i][0] == 0 && nums[i][1] == 0 && nums[i][2] == 0 && nums[i][3] == 0)
                                                break; 
                                        if (nums[i][j-1] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i][j-1] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                j = 4; 
                                        }
                                }
                        for (int i = 0; i < 4; i++)
                                for (int j = 0; j < 3; j++)
                                        if (nums[i][j] == nums[i][j+1] && nums[i][j] != 0)
                                        {
                                                nums[i][j+1] *= 2; 
                                                nums[i][j] = 0;
                                                j++;
                                        }
                        for (int i = 0; i < 4; i++)
                                for (int j = 3; j > 0; j--)
                                {
                                        if (nums[i][0] == 0 && nums[i][1] == 0 && nums[i][2] == 0 && nums[i][3] == 0)
                                                break; 
                                        if (nums[i][j-1] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i][j-1] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                j = 4; 
                                        }
                                }
                }
                else if (direction == 1)
                {
                        for (int j = 0; j < 4; j++)
                                for (int i = 3; i > 0; i--)
                                {
                                        if (nums[0][i] == 0 && nums[1][i] == 0 && nums[2][i] == 0 && nums[3][i] == 0)
                                                break; 
                                        if (nums[i-1][j] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i-1][j] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                i = 4; 
                                        }
                                }
                        for (int j = 0; j < 4; j++)
                                for (int i = 0; i < 3; i++)
                                        if (nums[i][j] == nums[i+1][j] && nums[i][j] != 0)
                                        {
                                                nums[i+1][j] *= 2; 
                                                nums[i][j] = 0;
                                                i++;
                                        }
                        for (int j = 0; j < 4; j++)
                                for (int i = 3; i > 0; i--)
                                {
                                        if (nums[0][i] == 0 && nums[1][i] == 0 && nums[2][i] == 0 && nums[3][i] == 0)
                                                break; 
                                        if (nums[i-1][j] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i-1][j] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                i = 4; 
                                        }
                                }
                }
                else if (direction == 2)
                {
                        for (int i = 0; i < 4; i++)
                                for (int j = 0; j < 3; j++)
                                {
                                        if (nums[i][0] == 0 && nums[i][1] == 0 && nums[i][2] == 0 && nums[i][3] == 0)
                                                break; 
                                        if (nums[i][j+1] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i][j+1] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                j = -1; 
                                        }
                                }
                        for (int i = 0; i < 4; i++)
                                for (int j = 3; j > 0; j--)
                                        if (nums[i][j] == nums[i][j-1] && nums[i][j] != 0)
                                        {
                                                nums[i][j-1] *= 2; 
                                                nums[i][j] = 0;
                                                j--;
                                        }
                        for (int i = 0; i < 4; i++)
                                for (int j = 0; j < 3; j++)
                                {
                                        if (nums[i][0] == 0 && nums[i][1] == 0 && nums[i][2] == 0 && nums[i][3] == 0)
                                                break; 
                                        if (nums[i][j+1] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i][j+1] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                j = -1; 
                                        }
                                }
                }
                else if (direction == 3)
                {
                        for (int j = 0; j < 4; j++)
                                for (int i = 0; i < 3; i++)
                                {
                                        if (nums[0][i] == 0 && nums[1][i] == 0 && nums[2][i] == 0 && nums[3][i] == 0)
                                                break; 
                                        if (nums[i+1][j] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i+1][j] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                i = -1; 
                                        }
                                }

                        for (int j = 0; j < 4; j++)
                                for (int i = 3; i > 0; i--)
                                        if (nums[i][j] == nums[i-1][j] && nums[i][j] != 0)
                                        {
                                                nums[i-1][j] *= 2; 
                                                nums[i][j] = 0;
                                                i--; 
                                        }
                        for (int j = 0; j < 4; j++)
                                for (int i = 0; i < 3; i++)
                                {
                                        if (nums[0][i] == 0 && nums[1][i] == 0 && nums[2][i] == 0 && nums[3][i] == 0)
                                                break; 
                                        if (nums[i+1][j] == 0 && nums[i][j] != 0)
                                        {
                                                nums[i+1][j] = nums[i][j]; 
                                                nums[i][j] = 0;
                                                i = -1; 
                                        }
                                }
                }

                for (int i = 0; i < 4; i++)
                {
                        System.out.println(nums[i][0] + " " + nums[i][1] + " " + nums[i][2] + " " + nums[i][3]);
                }

        }
}