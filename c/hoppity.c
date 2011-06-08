#include <stdio.h>
#include <stdlib.h>

void usage(char* name)
{
  printf("Usage: %s <file>\n", name);
  exit(1);
}

void hoppity(int n)
{
  for (int i = 1; i <= n; i++)
  {
      char* s = i % 15 == 0 ? "Hop" \
              : i %  5 == 0 ? "Hophop" \
              : i %  3 == 0 ? "Hoppity" \
              : NULL;
      if (s != NULL)
      {
        printf("%s\n", s);
      }
  }
}

int main(int argc, char* argv[])
{
  if (argc != 2)
  {
    usage(argv[0]);
  }

  freopen(argv[1], "r", stdin);

  int n;
  scanf("%d", &n);

  hoppity(n);

  return 0;
}
