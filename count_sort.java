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
        int k=0,i=0;
        while(k<=max)
        {
            if(count[k]>0)
            {
                a[i]=k;
                count[k]--;
                i++;
            }
            else
            k++;
        }
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
