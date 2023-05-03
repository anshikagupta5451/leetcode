class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++)
        {
            sum=salary[i]+sum;
        }
        System.out.println(sum+" ");
        return sum/(salary.length-2);
    }
}