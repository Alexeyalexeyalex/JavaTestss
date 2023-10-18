class Lists:
    """
    class lists 
    """
    def __init__(self, my_lst: list):
        for item in my_lst:
            if not isinstance(item, int) and not isinstance(item, float):
                raise ValueError("Type must be int or float")

        self.my_list = my_lst

    def srzn(self):
        return sum(self.my_list) / len(self.my_list)  

    def __gt__(self, other):
        return self.srzn() > other.srzn()
    
    def __lt__(self, other):
        return self.srzn() < other.srzn()

    def __eq__(self, other):
        return self.srzn() == other.srzn()



a = Lists([1,2,3,5])
b = Lists([1,2])

print(a>b)
print(a<b)
print(a==b)
