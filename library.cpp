#include <cstdlib>
#include <cstdio>
#include <string>
#include <iostream>
#include <sstream>

using namespace std;

#ifdef __cplusplus
extern "C"
{
#endif

#define INT 0
#define PAIR 1

struct object{
    object *first, *second;
    int val;
    int type;
};

string output(object* obj) {
    ostringstream oss;
    if (obj->type == INT)
        oss << obj->val;
    else {
        oss << "(" << output(obj->first) << ", " << output(obj->second) << ")";
    }
    return oss.str();
}

int print(object* obj) {
    cout << output(obj) << endl;
    return 0;
}

object* createInt(int val) {
    object* ret = (object*)malloc(sizeof(object));
    ret->val = val;
    ret->type = INT;
    return ret;
}


object* createPair(object* first, object* second) {
    object* ret = (object*)malloc(sizeof(object));
    ret->first = first;
    ret->second = second;
    ret->type = PAIR;
    return ret;
}

object* first(object *obj) {
    if (obj->type == PAIR)
        return obj->first;
    else {
        cerr << "type error" << endl;
        exit(1);
    }
}

object* second(object *obj) {
    if (obj->type == PAIR)
        return obj->second;
    else {
        cerr << "type error" << endl;
        exit(1);
    }
}

#ifdef __cplusplus
}
#endif
