"""Tests for module Lists"""

import pytest
from lists import Lists

@pytest.fixture
def set_first_list():
    """ create first test list """

    return Lists([1,2,3,5])


@pytest.fixture
def set_second_list():
    """ create second test list """

    return Lists([1,2])



def test_more_list(set_first_list, set_second_list):
    """ testing function more then """

    assert set_first_list > set_second_list


def test_less_list(set_first_list, set_second_list):
    """ testing function less then """

    assert set_second_list < set_first_list


def test_eq_list(set_first_list):
    """ testing function equals lists """

    theard_list = Lists([1,2,5,3])
    assert set_first_list == theard_list




if __name__ == '__main__':
    pytest.main(['v'])
