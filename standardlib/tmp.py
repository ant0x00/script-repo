import sys, os

def main_argv(argv=None):
    print sys.argv
    print len(sys.argv)
    print sys.argv[0]
    print sys.argv[2:]

if __name__ == "__main__":
    print sys.argv[:]
    main_argv()
