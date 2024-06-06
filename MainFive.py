import random

class Coin:
    def __init__(self):
        self.HEADS = 0
        self.TAILS = 1
        self.face = None
        self.flip()

    def flip(self):
        self.face = random.randint(0, 1)

    def is_heads(self):
        return self.face == self.HEADS

    def __str__(self):
        if self.face == self.HEADS:
            return "Heads"
        else:
            return "Tails"

if __name__ == "__main__":
    coins = Coin()
    flip = ""
    head = 0
    tail = 0
    head_max = 0
    tail_max = 0

    for _ in range(100):
        coins.flip()
        flip = str(coins)

        if flip == "Heads":
            if tail > tail_max:
                tail_max = tail
            tail = 0
            head += 1
        else:
            if head > head_max:
                head_max = head
            head = 0
            tail += 1

    if head_max > tail_max:
        print("Heads:", head_max)
    elif tail_max > head_max:
        print("Tails:", tail_max)
    else:
        print("It's a Tie!")
