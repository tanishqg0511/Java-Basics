public class Main
{
    
    static void sort(int a[])
    {
        int n=a.length;
        int output[]=new int[n+1];
        int max=0;
        for(int i=0;i<n;i++)
        if(a[i]>max)
        max=a[i];
        int count[]=new int[max+1];
        for(int i=0;i<=max;i++)
        count[i]=0;
        
        for(int i=0;i<n;i++)
        count[a[i]]++;
        
        for(int i=1;i<=max;i++)
        count[i]+=count[i-1];
        
        for(int i=n-1;i>=0;i--)
        {
            output[count[a[i]]-1]=a[i];
            count[a[i]]--;
        }
        
        for(int i=0;i<n;i++)
        a[i]=output[i];
    }
    static void print(int a[]){
        for(int i:a)
        System.out.println(i);
    }
	public static void main(String[] args) {
    int a[]={6,2,4,5,9,8,5,1,0};
    sort(a);
    print(a);
	}
}
