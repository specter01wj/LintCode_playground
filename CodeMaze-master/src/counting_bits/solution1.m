#import <Foundation/Foundation.h>

NSArray* countBits(int num)
{
	NSNumber *capacity = [NSNumber numberWithInt:(num + 1)];
	NSMutableArray * arr = [[NSMutableArray alloc] initWithCapacity:[capacity integerValue]];
	int count_bit, tmp;
	
	for (int i = 0; i <= num; ++i) {
		count_bit = 0;
		tmp = i;
		while (tmp >= 2) {
			count_bit += tmp % 2;
			tmp /= 2;
		}
		count_bit += tmp;
		[arr addObject:[NSNumber numberWithInt:count_bit]];
	}
	
	return [NSArray arrayWithArray:arr];
}

int main(int argc, char *argv[]) {
	@autoreleasepool {
		for (id i in countBits(5)) {
			NSLog(@"%@", i);
		}
	}
}