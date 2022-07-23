#pragma once
#include
#include
#include
#include
<algorithm>
<functional>
<stack>
<vector>
using NodeFunc = std::function<void (int)>;
using EdgeFunc = std::function<void (int, int)>;