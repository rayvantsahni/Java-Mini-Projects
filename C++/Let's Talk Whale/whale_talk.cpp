#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
  string phrase = "a whale of a deal";
  vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};
  vector<char> result;

  for (int i = 0; i < phrase.size(); i++)
  {
    for (int j = 0; j < vowels.size(); j++)
    {
      if (phrase[i] == vowels[j])
      {
        result.push_back(phrase[i]);
      }
    }
    if (phrase[i] == 'e' or phrase[i] == 'u')
    {
      result.push_back(phrase[i]);
    }
  }

  for (int i = 0; i < result.size(); i++)
  {
    cout << result[i];
  }
  cout << endl;
}
