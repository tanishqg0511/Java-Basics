public class Main
{
    static int partition(int a[],int l,int h)
    {
        int pivot=a[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[h];
        a[h]=temp;
        return (i+1);
    }
    static void sort(int a[],int l,int h)
    {
        if(l<h)
        {
            int p=partition(a,l,h);
            sort(a,l,p-1);
            sort(a,p+1,h);
        }
    }
    static void print(int a[]){
        for(int i:a)
        System.out.println(i);
    }
	public static void main(String[] args) {
    int a[]={5,6,0,1,9,6,4,3,10};
    int n=a.length;
    sort(a,0,n-1);
    print(a);
	}
}
