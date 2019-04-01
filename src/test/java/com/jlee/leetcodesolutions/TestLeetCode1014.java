package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1014;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1014 {
  @Test
  public void testProblemCase1() {
    int[] A = {8,1,5,2,6};
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(11, solution.maxScoreSightseeingPair(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = { 585, 548, 743, 321, 54, 577, 203, 338, 481, 765, 905, 224, 678, 368, 688, 522, 962, 576, 69, 294, 639,
        193, 120, 483, 312, 891, 947, 674, 497, 832, 988, 595, 747, 214, 494, 627, 531, 179, 502, 853, 174, 469, 406,
        294, 490, 12, 675, 999, 864, 198, 553, 978, 682, 30, 636, 25, 181, 564, 881, 796, 550, 779, 668, 736, 912, 854,
        777, 879, 76, 918, 635, 966, 568, 191, 560, 918, 704, 688, 698, 522, 299, 656, 918, 761, 86, 695, 913, 78, 106,
        948, 273, 183, 499, 118, 806, 710, 89, 191, 326, 67, 243, 349, 373, 137, 786, 670, 823, 378, 799, 485, 401, 690,
        351, 863, 150, 422, 696, 21, 482, 791, 589, 810, 1000, 818, 31, 77, 250, 15, 945, 958, 159, 347, 955, 856, 590,
        914, 412, 796, 888, 566, 511, 719, 999, 595, 582, 715, 937, 490, 357, 919, 216, 964, 580, 945, 93, 732, 521,
        722, 726, 863, 267, 931, 969, 490, 933, 298, 941, 884, 902, 45, 279, 208, 58, 309, 460, 629, 118, 254, 443, 359,
        686, 35, 787, 564, 547, 605, 805, 173, 641, 37, 49, 256, 621, 918, 669, 635, 939, 236, 994, 817, 142, 642, 369,
        361, 453, 129, 225, 102, 240, 435, 35, 431, 948, 146, 382, 354, 706, 268, 392, 347, 621, 348, 7, 498, 460, 229,
        968, 991, 595, 826, 435, 200, 680, 652, 167, 489, 563, 879, 463, 791, 515, 555, 69, 528, 420, 10, 835, 190, 420,
        248, 708, 760, 197, 578, 931, 304, 25, 449, 78, 1000, 216, 614, 496, 199, 482, 108, 538, 159, 295, 773, 317,
        947, 329, 398, 510, 241, 962, 141, 325, 572, 334, 907, 666, 1, 439, 520, 532, 617, 952, 65, 734, 956, 505, 47,
        958, 553, 206, 159, 601, 842, 150, 261, 257, 915, 500, 899, 869, 31, 217, 536, 37, 147, 901, 856, 215, 840, 270,
        479, 601, 132, 39, 345, 490, 512, 695, 678, 376, 198, 873, 119, 609, 843, 70, 213, 953, 801, 370, 542, 240, 248,
        140, 594, 311, 471, 720, 372, 668, 530, 698, 754, 307, 277, 723, 618, 843, 468, 379, 295, 404, 395, 746, 190,
        590, 603, 936, 973, 124, 748, 968, 820, 959, 458, 468, 876, 203, 617, 151, 445, 270, 783, 590, 967, 176, 900,
        46, 325, 624, 946, 424, 10, 737, 343, 844, 395, 765, 60, 312, 102, 735, 244, 663, 711, 577, 308, 417, 133, 988,
        402, 509, 355, 368, 856, 195, 21, 701, 488, 660, 261, 306, 831, 354, 765, 868, 138, 504, 639, 302, 848, 120,
        862, 279, 229, 280, 881, 759, 874, 923, 53, 36, 662, 222, 635, 283, 251, 213, 319, 163, 899, 683, 895, 615, 366,
        525, 726, 906, 430, 562, 982, 688, 688, 758, 23, 654, 798, 3, 823, 968, 46, 889, 593, 845, 682, 123, 186, 472,
        809, 755, 371, 317, 204, 53, 773, 305, 121, 427, 234, 389, 35, 408, 315, 29, 764, 204, 796, 339, 219, 719, 978,
        872, 753, 113, 93, 797, 652, 772, 22, 760, 271, 870, 835, 8, 334, 461, 989, 195, 631, 195, 777, 495, 530, 861,
        552, 219, 660, 23, 612, 616, 523, 445, 436, 289, 641, 734, 563, 200, 62, 808, 294, 862, 739, 122, 553, 415, 951,
        195, 252, 420, 290, 799, 169, 405, 111, 799, 935, 726, 92, 85, 469, 763, 292, 366, 909, 396, 980, 928, 811, 747,
        185, 907, 775, 104, 440, 960, 733, 836, 574, 772, 542, 283, 750, 671, 809, 985, 857, 390, 565, 155, 647, 494,
        527, 508, 994, 510, 62, 232, 535, 932, 672, 504, 880, 523, 302, 695, 79, 323, 26, 162, 742, 739, 117, 170, 24,
        432, 378, 115, 27, 379, 214, 70, 507, 96, 402, 558, 576, 605, 145, 10, 410, 920, 89, 882, 687, 975, 694, 282,
        898, 575, 665, 409, 437, 197, 722, 662, 678, 133, 852, 211, 74, 991, 139, 849, 801, 588, 523, 349, 75, 313, 341,
        521, 234, 317, 190, 557, 899, 865, 103, 276, 942, 610, 998, 21, 701, 594, 692, 740, 897, 915, 131, 596, 616,
        897, 207, 364, 30, 487, 843, 394, 893, 281, 502, 449, 923, 48, 457, 921, 582, 738, 377, 274, 686, 142, 846, 334,
        697, 569, 853, 444, 313, 437, 707, 514, 790, 358, 568, 834, 489, 474, 906, 758, 421, 301, 144, 450, 854, 492,
        722, 93, 969, 222, 755, 584, 600, 609, 834, 714, 623, 995, 435, 96, 431, 633, 455, 380, 640, 574, 958, 616, 706,
        987, 498, 318, 401, 797, 690, 720, 183, 828, 293, 771, 20, 868, 682, 33, 177, 802, 212, 634, 506, 47, 222, 666,
        602, 674, 729, 847, 563, 744, 138, 177, 598, 976, 555, 932, 807, 997, 509, 15, 533, 575, 456, 434, 1, 206, 206,
        273, 820, 104, 924, 908, 967, 933, 558, 152, 595, 878, 105, 505, 532, 585, 339, 670, 700, 976, 617, 478, 136,
        241, 210, 622, 65, 494, 660, 416, 391, 412, 414, 671, 206, 923, 746, 239, 997, 418, 464, 804, 281, 6, 824, 193,
        724, 371, 942, 30, 890, 305, 541, 902, 714, 121, 754, 722, 798, 615, 541, 397, 66, 504, 668, 231, 188, 888, 178,
        98, 519, 143, 805, 156, 253, 441, 579, 545, 631, 898, 272, 615, 749, 407, 890, 751, 937, 191, 318, 627, 859,
        475, 96, 669, 160, 812, 508, 205, 161, 433, 665, 358, 602, 479, 457, 741, 644, 186, 84, 58, 97, 297, 958, 468,
        182, 263, 557, 591, 11, 111, 57, 863, 234, 578, 52, 720, 401, 674, 624, 620, 761, 218, 597, 530, 4, 543, 355,
        811, 875, 176, 60, 322, 644, 166, 292, 227, 210, 913, 795, 254, 213, 612, 931, 379, 691, 711, 226, 708, 145,
        636, 934, 612, 118, 195, 25, 5, 505, 944, 600, 532, 924, 959, 909, 12, 733, 380, 187, 402, 938, 812, 575, 733,
        61, 663, 522, 160, 870, 412, 977, 479, 887, 604, 799, 786, 353, 159, 715, 981, 892, 386, 234, 794, 339, 848, 75,
        115, 714, 788, 611, 345, 678, 524, 904, 970, 590, 717, 905, 844, 37, 270, 940, 705, 386, 90, 51, 310, 973, 497,
        778, 428, 967, 715, 622, 585, 501, 433, 87, 795, 559, 816, 764, 959, 742, 299, 957, 174, 533, 404, 653, 97, 129,
        94, 928, 873, 560, 306, 742, 372, 84, 508, 781, 584, 652, 705, 443, 461, 682, 281, 5, 163, 712, 579, 482, 460,
        443, 919, 571, 684, 49, 609, 67, 868, 665, 225, 199, 380, 65, 878, 867, 384, 887, 600, 799, 823, 217, 364, 379,
        369, 924, 165, 24, 447, 137, 740, 382, 157, 254, 506, 773, 119, 794, 755, 440, 407, 711, 368, 713, 488, 440,
        769, 646, 241, 170, 375, 665, 174, 46, 334, 742, 440, 690, 501, 306, 856, 551, 345, 668, 749, 66, 563, 363, 777,
        291, 700, 55, 9, 975, 208, 163, 610, 608, 413, 627, 830, 525, 815, 980, 230, 322, 449, 318, 727, 739, 771, 183,
        522, 506, 498, 55, 924, 949, 875, 960, 897, 520, 637, 779, 757, 730, 667, 65, 417, 759, 110, 247, 204, 391, 254,
        647, 535, 716, 660, 267, 904, 687, 7, 588, 937, 982, 460, 212, 247, 625, 410, 950, 555, 3, 749, 911, 375, 489,
        618, 655, 228, 399, 376, 371, 190, 622, 161, 591, 51, 289, 893, 118, 901, 773, 998, 866, 206, 393, 505, 181,
        424, 288, 587, 374, 593, 821, 349, 982, 874, 58, 357, 971, 144, 355, 197, 578, 428, 186, 747, 938, 62, 677, 917,
        172, 332, 275, 973, 331, 458, 881, 274, 469, 290, 293, 295, 388, 705, 123, 934, 748, 470, 136, 325, 26, 560,
        619, 81, 852, 307, 115, 550, 799, 525, 528, 516, 101, 65, 828, 736, 322, 96, 725, 658, 966, 137, 418, 698, 443,
        546, 557, 773, 670, 237, 636, 529, 217, 975, 427, 501, 177, 150, 602, 769, 311, 268, 314, 108, 633, 224, 476,
        467, 28, 683, 931, 265, 98, 131, 975, 238, 473, 484, 2, 608, 800, 523, 349, 602, 366, 134, 519, 100, 910, 401,
        703, 771, 87, 15, 217, 449, 75, 754, 865, 167, 71, 502, 635, 9, 629, 509, 899, 131, 305, 248, 179, 657, 18, 467,
        716, 775, 155, 33, 493, 639, 832, 517, 67, 786, 825, 868, 76, 221, 517, 143, 153, 513, 786, 860, 268, 822, 837,
        176, 35, 852, 745, 796, 787, 111, 488, 826, 138, 423, 100, 949, 954, 307, 952, 191, 466, 326, 750, 685, 563,
        618, 804, 272, 184, 97, 616, 636, 855, 565, 742, 742, 931, 575, 524, 997, 20, 29, 18, 201, 278, 2, 244, 268,
        320, 262, 761, 551, 760, 224, 563, 190, 536, 270, 905, 481, 412, 875, 658, 367, 576, 386, 544, 832, 279, 195,
        251, 776, 32, 199, 610, 912, 65, 922, 102, 48, 821, 247, 786, 488, 392, 769, 885, 553, 504, 641, 976, 9, 866,
        821, 772, 257, 476, 632, 442, 591, 575, 735, 584, 158, 132, 705, 290, 948, 995, 923, 461, 350, 353, 455, 809,
        415, 978, 257, 885, 579, 568, 155, 300, 111, 909, 913, 815, 509, 14, 65, 955, 930, 578, 310, 774, 385, 986, 181,
        308, 814, 565, 997, 784, 266, 540, 126, 688, 278, 471, 713, 215, 232, 826, 338, 391, 962, 695, 155, 126, 334,
        132, 937, 327, 945, 721, 830, 929, 130, 274, 524, 97, 775, 152, 821, 914, 641, 257, 805, 59, 351, 912, 545, 488,
        988, 269, 632, 490, 608, 109, 89, 569, 841, 467, 958, 952, 282, 901, 322, 869, 857, 625, 148, 573, 858, 853, 51,
        131, 995, 671, 623, 456, 995, 618, 199, 934, 422, 274, 934, 630, 234, 902, 594, 773, 168, 150, 272, 913, 818,
        281, 696, 973, 38, 519, 938, 328, 985, 442, 545, 80, 671, 109, 759, 8, 117, 744, 281, 924, 873, 628, 331, 497,
        81, 462, 191, 373, 933, 675, 910, 229, 609, 895, 829, 525, 714, 21, 105, 169, 224, 100, 22, 188, 636, 863, 602,
        507, 163, 316, 60, 660, 570, 938, 704, 755, 594, 965, 235, 416, 271, 882, 394, 753, 186, 198, 316, 540, 79, 979,
        519, 312, 938, 301, 993, 460, 401, 251, 902, 894, 363, 48, 3, 225, 938, 318, 222, 352, 671, 141, 719, 173, 839,
        365, 438, 759, 532, 554, 252, 258, 694, 62, 689, 917, 800, 983, 892, 900, 891, 587, 505, 830, 795, 720, 895,
        785, 234, 149, 567, 75, 414, 894, 949, 812, 171, 56, 250, 599, 549, 490, 580, 602, 937, 243, 363, 55, 152, 999,
        827, 225, 505, 93, 545, 277, 435, 693, 982, 307, 890, 89, 946, 221, 939, 296, 77, 188, 965, 632, 597, 424, 709,
        958, 883, 56, 359, 471, 197, 473, 337, 266, 714, 688, 139, 300, 44, 191, 401, 487, 319, 744, 160, 712, 202, 580,
        993, 750, 796, 691, 168, 127, 839, 527, 223, 294, 101, 112, 26, 938, 554, 605, 444, 928, 530, 17, 468, 83, 473,
        202, 905, 860, 406, 890, 891, 841, 479, 516, 267, 867, 151, 397, 413, 743, 106, 620, 72, 419, 133, 187, 750,
        437, 666, 140, 766, 675, 830, 900, 752, 852, 527, 474, 562, 744, 62, 617, 362, 412, 324, 75, 30, 989, 787, 332,
        794, 985, 350, 112, 66, 811, 117, 440, 592, 708, 775, 562, 985, 610, 923, 938, 414, 281, 707, 564, 698, 199,
        396, 121, 169, 474, 954, 873, 191, 523, 828, 784, 747, 313, 257, 345, 978, 434, 697, 265, 187, 889, 29, 832,
        406, 358, 449, 47, 518, 311, 959, 1000, 569, 476, 821, 486, 428, 361, 693, 170, 440, 168, 252, 391, 683, 530,
        457, 938, 529, 97, 205, 647, 896, 874, 64, 237, 694, 593, 484, 468, 907, 184, 647, 795, 532, 716, 512, 799, 705,
        566, 823, 682, 635, 211, 926, 349, 633, 107, 479, 338, 920, 488, 227, 445, 764, 440, 465, 51, 806, 110, 954,
        405, 551, 927, 259, 787, 989, 515, 188, 812, 401, 883, 136, 491, 83, 380, 422, 895, 3, 976, 831, 894, 635, 488,
        480, 446, 794, 491, 585, 282, 254, 853, 179, 946, 780, 637, 425, 431, 838, 821, 852, 455, 440, 304, 515, 384,
        361, 316, 443, 416, 402, 214, 39, 660, 733, 228, 81, 986, 181, 48, 71, 667, 489, 115, 851, 394, 318, 375, 584,
        943, 119, 939, 642, 784, 128, 888, 758, 560, 553, 920, 473, 965, 37, 316, 843, 256, 638, 26, 70, 465, 49, 837,
        404, 391, 18, 99, 602, 325, 614, 966, 871, 824, 543, 786, 718, 336, 817, 480, 849, 981, 654, 385, 995, 566, 877,
        58, 708, 207, 860, 309, 21, 362, 68, 538, 976, 114, 936, 91, 987, 811, 149, 395, 480, 173, 373, 763, 816, 394,
        654, 238, 424, 28, 855, 777, 323, 337, 749, 810, 515, 160, 302, 924, 517, 414, 252, 791, 844, 983, 449, 18, 281,
        324, 5, 868, 180, 777, 149, 81, 147, 288, 998, 777, 746, 107, 910, 701, 677, 872, 297, 735, 336, 786, 702, 363,
        408, 67, 391, 213, 48, 976, 87, 432, 746, 925, 270, 401, 966, 115, 831, 494, 740, 573, 795, 439, 179, 537, 838,
        932, 981, 263, 472, 987, 581, 307, 302, 275, 605, 372, 447, 625, 569, 701, 600, 235, 962, 657, 614, 367, 510,
        670, 733, 662, 908, 723, 339, 637, 843, 973, 376, 132, 701, 788, 472, 539, 44, 900, 314, 221, 481, 998, 673,
        488, 205, 368, 428, 209, 42, 921, 658, 712, 611, 599, 989, 803, 962, 73, 73, 537, 896, 857, 160, 571, 546, 117,
        975, 685, 82, 615, 145, 626, 731, 163, 432, 110, 483, 14, 794, 619, 606, 118, 45, 844, 363, 327, 790, 108, 124,
        482, 376, 893, 430, 515, 574, 145, 726, 633, 46, 741, 616, 220, 947, 918, 629, 886, 547, 636, 941, 639, 703,
        773, 903, 77, 825, 835, 864, 292, 380, 315, 202, 499, 841, 526, 216, 211, 327, 42, 383, 442, 234, 127, 776, 896,
        201, 758, 742, 953, 604, 236, 916, 207, 760, 456, 963, 280, 658, 352, 297, 794, 679, 984, 477, 407, 641, 744,
        35, 179, 385, 256, 967, 666, 865, 833, 301, 754, 198, 952, 428, 980, 472, 519, 841, 557, 728, 459, 691, 349,
        182, 808, 289, 772, 916, 904, 302, 481, 722, 947, 878, 110, 206, 110, 296, 913, 960, 52, 732, 996, 525, 332,
        835, 828, 308, 568, 586, 378, 368, 423, 343, 424, 487, 222, 513, 745, 834, 441, 836, 757, 558, 530, 271, 321,
        246, 615, 691, 201, 746, 769, 786, 389, 108, 882, 237, 535, 788, 691, 682, 200, 122, 601, 199, 558, 757, 117,
        482, 373, 166, 680, 353, 922, 197, 700, 188, 927, 992, 31, 925, 269, 37, 796, 382, 590, 537, 692, 103, 652, 153,
        856, 104, 994, 242, 446, 500, 104, 823, 313, 533, 621, 148, 624, 48, 955, 268, 425, 486, 958, 875, 316, 276,
        746, 166, 902, 308, 123, 846, 634, 239, 235, 89, 115, 793, 323, 322, 474, 380, 648, 632, 584, 773, 979, 873, 48,
        811, 836, 414, 436, 875, 308, 575, 802, 900, 917, 80, 52, 967, 238, 348, 918, 724, 745, 149, 472, 112, 74, 543,
        808, 629, 810, 938, 720, 384, 159, 160, 532, 814, 130, 511, 25, 530, 479, 807, 182, 867, 258, 294, 184, 621,
        684, 564, 913, 347, 174, 506, 156, 92, 403, 937, 560, 902, 140, 957, 597, 883, 631, 318, 746, 933, 572, 899,
        561, 241, 416, 229, 488, 443, 12, 696, 249, 193, 620, 731, 259, 579, 413, 110, 878, 179, 936, 880, 732, 635,
        558, 595, 355, 501, 83, 292, 163, 590, 567, 310, 375, 613, 383, 264, 831, 96, 419, 389, 639, 994, 116, 794, 59,
        588, 614, 792, 971, 481, 36, 233, 472, 377, 258, 475, 351, 534, 206, 706, 533, 835, 21, 319, 634, 331, 522, 586,
        278, 753, 405, 43, 912, 739, 106, 858, 818, 126, 884, 924, 487, 640, 156, 352, 686, 929, 263, 323, 717, 57, 506,
        405, 469, 51, 852, 385, 933, 535, 201, 74, 869, 930, 25, 68, 445, 819, 714, 664, 720, 702, 101, 605, 329, 520,
        226, 80, 166, 262, 828, 513, 789, 446, 376, 571, 605, 450, 994, 780, 142, 301, 814, 349, 16, 803, 482, 740, 26,
        823, 887, 561, 341, 552, 532, 292, 512, 136, 106, 683, 371, 817, 198, 186, 916, 345, 657, 83, 891, 906, 429,
        662, 775, 116, 687, 314, 910, 767, 497, 374, 701, 270, 857, 700, 216, 536, 247, 230, 70, 680, 419, 716, 168,
        882, 862, 69, 847, 790, 567, 876, 534, 246, 181, 967, 80, 375, 421, 914, 436, 218, 739, 482, 791, 692, 191, 919,
        233, 391, 500, 474, 693, 839, 382, 366, 840, 748, 448, 851, 943, 403, 577, 134, 208, 22, 331, 286, 23, 494, 219,
        379, 664, 853, 555, 50, 418, 18, 328, 953, 42, 992, 459, 76, 498, 758, 165, 377, 95, 64, 285, 399, 53, 619, 533,
        959, 829, 244, 732, 742, 408, 589, 474, 563, 125, 379, 670, 141, 367, 30, 355, 853, 713, 195, 391, 132, 321,
        197, 350, 906, 709, 334, 716, 955, 5, 995, 579, 44, 732, 143, 10, 296, 785, 312, 510, 987, 824, 819, 497, 947,
        806, 753, 315, 704, 583, 588, 144, 375, 374, 599, 276, 550, 21, 138, 747, 516, 907, 637, 980, 323, 125, 339,
        421, 37, 889, 472, 417, 798, 598, 29, 37, 173, 956, 811, 119, 58, 903, 465, 797, 715, 673, 866, 273, 698, 792,
        259, 449, 192, 453, 697, 20, 880, 428, 429, 221, 767, 387, 932, 801, 943, 377, 872, 770, 486, 983, 206, 968,
        435, 705, 685, 207, 30, 415, 81, 680, 770, 628, 219, 249, 293, 284, 644, 675, 577, 334, 768, 76, 717, 215, 974,
        748, 30, 22, 937, 964, 233, 758, 749, 860, 621, 843, 130, 32, 104, 425, 630, 73, 423, 912, 971, 891, 750, 829,
        353, 322, 278, 637, 743, 515, 933, 447, 637, 576, 612, 91, 792, 941, 346, 762, 826, 825, 121, 565, 838, 690,
        729, 345, 831, 945, 535, 355, 785, 929, 88, 259, 554, 72, 963, 58, 167, 163, 893, 479, 268, 230, 222, 55, 822,
        233, 928, 791, 388, 744, 355, 535, 960, 657, 393, 872, 806, 420, 191, 757, 566, 104, 45, 506, 444, 595, 411,
        179, 729, 321, 829, 981, 720, 202, 341, 480, 402, 784, 584, 390, 526, 996, 201, 832, 93, 763, 783, 300, 404,
        301, 100, 698, 923, 261, 581, 534, 458, 106, 237, 169, 936, 339, 202, 427, 919, 543, 61, 728, 652, 625, 254,
        930, 715, 604, 820, 124, 282, 503, 115, 395, 412, 460, 350, 316, 851, 329, 957, 444, 399, 100, 348, 891, 332,
        912, 485, 585, 362, 810, 421, 786, 346, 704, 560, 233, 379, 894, 249, 262, 486, 237, 735, 289, 439, 622, 653,
        199, 370, 990, 832, 700, 327, 822, 528, 407, 119, 49, 66, 648, 706, 880, 677, 958, 742, 343, 123, 570, 140, 48,
        109, 820, 515, 918, 2, 696, 211, 919, 93, 924, 954, 612, 685, 869, 416, 949, 471, 718, 587, 751, 30, 856, 26,
        374, 86, 239, 328, 253, 548, 736, 919, 914, 432, 255, 253, 617, 230, 662, 168, 332, 99, 690, 677, 987, 244, 647,
        789, 253, 590, 959, 868, 177, 893, 802, 822, 464, 609, 25, 610, 994, 299, 296, 464, 417, 925, 357, 208, 987,
        435, 38, 35, 973, 88, 412, 149, 918, 624, 293, 598, 390, 239, 915, 576, 595, 330, 647, 512, 192, 349, 847, 20,
        281, 326, 971, 827, 959, 693, 868, 606, 753, 382, 777, 627, 273, 369, 707, 286, 733, 576, 707, 342, 491, 989,
        273, 701, 984, 52, 910, 447, 743, 497, 882, 354, 216, 62, 89, 528, 514, 300, 981, 518, 55, 491, 616, 690, 296,
        782, 110, 382, 445, 299, 760, 169, 832, 675, 183, 590, 855, 838, 797, 433, 62, 362, 985, 803, 440, 983, 618,
        460, 499, 349, 796, 182, 489, 293, 925, 310, 36, 797, 355, 123, 300, 362, 862, 133, 27, 343, 589, 296, 169, 257,
        751, 392, 454, 276, 265, 935, 322, 132, 586, 573, 211, 736, 609, 616, 891, 540, 36, 452, 257, 383, 514, 763,
        977, 297, 892, 599, 278, 23, 283, 504, 673, 894, 757, 561, 934, 982, 637, 672, 628, 688, 903, 105, 190, 451,
        379, 723, 800, 508, 494, 227, 602, 430, 167, 94, 999, 176, 981, 229, 311, 194, 440, 652, 50, 43, 870, 365, 604 };
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(1986, solution.maxScoreSightseeingPair(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {8};
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(0, solution.maxScoreSightseeingPair(A));
  }
}
