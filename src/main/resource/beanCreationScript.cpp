#include <iostream>
using namespace std;

int main() {
    for(int i=0;i<50;i++){
	printf("@Bean public DummyBean dummyBean\%d() { return new DummyBean(\"%d\");}\n", i,i);
    }
	return 0;
}
