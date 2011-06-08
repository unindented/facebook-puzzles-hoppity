KEYWORD = hoppity
FILES   = hoppity.c
FLAGS   = -std=gnu99 -O2 -pedantic -Wall -Wextra

$(KEYWORD): $(FILES) Makefile
	$(CC) $(FLAGS) -o $@ $< -lm

clean:
	-rm -f $(KEYWORD)

rebuild: clean $(KEYWORD)
