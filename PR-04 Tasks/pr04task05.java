class LNA{
public static int getLargest(int[]a,int total){
int t;
for(int i=0;i<total;i++){
for(int j=i+1;j<total;j++){
if(a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
return a[total-1];
}
public static void main(String args[]){
int a[]={9,8,7,6,5,1};
int b[]={123,231,24,311,634,0};
System.out.println("largest"+getLargest(a,6));
System.out.println("largest"+getLargest(b,7));
}}