#include <stdio.h>
int main()
{
  int a[] = {10,20,55,8,25,7};
  int n = 6;
  int ind_del = 2;
  for(int i=ind_del;i<n;i++)
  {
    a[i] = a[i+1];
  }
  for(int i =0;i<n-1;i++){
    printf("%d\n",a[i]);
  }
}