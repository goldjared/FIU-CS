CC=gcc
CFLAGS=-I.
DEPS = main.h
OBJ = hello.o bye.o main.o

%.o: %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

greeting: $(OBJ)
	$(CC) -o $@ $^ $(CFLAGS)
