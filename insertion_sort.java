public class Main
{
    static void sort(int a[])
    {
        int i,j,key;
        int n=a.length;
        for(i=0;i<n;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
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
