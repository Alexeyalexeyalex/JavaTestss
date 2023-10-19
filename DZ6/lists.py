""" Lists, creatng from user"""

class Lists:
    """
    class lists 
    """

    def __init__(self, my_lst: list):
        """ inition class"""

        for item in my_lst:
            if not isinstance(item, int) and not isinstance(item, float):
                raise ValueError("Type must be int or float")

        self.my_list = my_lst


    def average_value(self):
        """ average values of list """

        return sum(self.my_list) / len(self.my_list)

    def __gt__(self, other):
        """ function more then"""

        return self.average_value() > other.average_value()

    def __lt__(self, other):
        """ function less then"""

        return self.average_value() < other.average_value()


    def __eq__(self, other):
        """ function equals lists"""

        return self.average_value() == other.average_value()
    