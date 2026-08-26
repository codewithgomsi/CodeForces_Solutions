<h2><a href="https://codeforces.com/contest/1254/problem/B1" target="_blank" rel="noopener noreferrer">1254B1 — Send Boxes to Alice (Easy Version)</a></h2>

| | |
|---|---|
| **Difficulty** | 1800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1254B1](https://codeforces.com/contest/1254/problem/B1) |

## Topics
`constructive algorithms` `greedy` `math` `number theory` `ternary search` `two pointers`

---

## Problem Statement

<div class="header"><div class="title">B1. Send Boxes to Alice (Easy Version)</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p><span class="tex-font-style-it">This is the easier version of the problem. In this version, $$$1 \le n \le 10^5$$$ and $$$0 \le a_i \le 1$$$. You can hack this problem only if you solve and lock both problems.</span></p><p>Christmas is coming, and our protagonist, Bob, is preparing a spectacular present for his long-time best friend Alice. This year, he decides to prepare $$$n$$$ boxes of chocolate, numbered from $$$1$$$ to $$$n$$$. Initially, the $$$i$$$-th box contains $$$a_i$$$ chocolate pieces.</p><p>Since Bob is a typical nice guy, he will not send Alice $$$n$$$ empty boxes. In other words, <span class="tex-font-style-bf">at least one of $$$a_1, a_2, \ldots, a_n$$$ is positive</span>. Since Alice dislikes coprime sets, she will be happy only if there exists some integer $$$k  \gt  1$$$ such that the number of pieces in each box is divisible by $$$k$$$. Note that Alice won't mind if there exists some empty boxes. </p><p>Charlie, Alice's boyfriend, also is Bob's second best friend, so he decides to help Bob by rearranging the chocolate pieces. In one second, Charlie can pick up a piece in box $$$i$$$ and put it into either box $$$i-1$$$ or box $$$i+1$$$ (if such boxes exist). Of course, he wants to help his friend as quickly as possible. Therefore, he asks you to calculate the minimum number of seconds he would need to make Alice happy.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$n$$$ ($$$1 \le n \le 10^5$$$) — the number of chocolate boxes.</p><p>The second line contains $$$n$$$ integers $$$a_1, a_2, \ldots, a_n$$$ ($$$0 \le a_i \le 1$$$) — the number of chocolate pieces in the $$$i$$$-th box.</p><p>It is guaranteed that at least one of $$$a_1, a_2, \ldots, a_n$$$ is positive.</p></div><div class="output-specification"><div class="section-title">Output</div><p>If there is no way for Charlie to make Alice happy, print $$$-1$$$.</p><p>Otherwise, print a single integer $$$x$$$ — the minimum number of seconds for Charlie to help Bob make Alice happy.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00617986794003033" id="id009260583144660013" class="input-output-copier">Copy</div></div><pre id="id00617986794003033">3
1 0 1
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005241154918245521" id="id0041237251479202164" class="input-output-copier">Copy</div></div><pre id="id005241154918245521">2
</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007187470007236364" id="id004923159176197043" class="input-output-copier">Copy</div></div><pre id="id007187470007236364">1
1
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id008715390350978975" id="id0012050902996641943" class="input-output-copier">Copy</div></div><pre id="id008715390350978975">-1
</pre></div></div></div>