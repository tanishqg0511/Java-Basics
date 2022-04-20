public class Main
{
    static void merge(int a[],int l,int m, int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        
        for(int i=0;i<n1;i++)
        L[i]=a[l+i];
        for(int i=0;i<n2;i++)
        R[i]=a[m+1+i];
        
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k++]=L[i++];
            }
            else
            a[k++]=R[j++];
        }
        while(i<n1)
        {
            a[k++]=L[i++];
        }
        while(j<n2)
        a[k++]=R[j++];
    }
    static void sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    static void print(int a[]){
        for(int i:a)
        System.out.println(i);
    }
	public static void main(String[] args) {
    int a[]={12, 11, 13, 5, 6, 7 };
    sort(a,0,a.length-1);
    print(a);
	}
}
