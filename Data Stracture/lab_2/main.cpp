#include <iostream>
#include <stack>
using namespace std;

int main()
{
    int n;
    cin>>n;
     stack<int> stack;
    for (int i=0;i<n;i++){
      int x;
      cin>>x;
      stack.push(x);

    }

    int min =stack.top();
    int max =stack.top();
   for (int i=0;i<n;i++){

      int x;
      stack.pop(x);
      if(x<min)
            min=x;
      if(x>max)
            max=x;


    }
    cout << min<<"  "<<max << endl;
    return 0;
}
