public class Main
{
    static void sort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min_idx])
                min_idx=j;
            }
            int temp=a[i];
            a[i]=a[min_idx];
            a[min_idx]=temp;
        }
    }
    static void print(int a[]){
        for(int i:a)
        System.out.println(i);
    }
	public static void main(String[] args) {
    int a[]={5,6,0,1,9,6,4,3,10};
    sort(a);
    print(a);
	}
}
