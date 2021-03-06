package easy;

/**
 * 
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * @author Zhang shaoyang
 * 
 *         2018年10月14日
 */
public class ReverseBits {
	public int reverseBits(int n) {
		int result = 0;
		for(int i = 0;i<32;i++) {
			result += n & 1;
			n>>>=1;
			if(i<31) {
				result <<= 1;
			}
		}
		return result;
	}
}
