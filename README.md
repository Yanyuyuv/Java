…或者在命令行上创建一个新的存储库

echo "# -" >> README.md

git init

git add README.md

git commit -m "first commit"

git branch -M main

git remote add origin https://github.com/Yanyuyuv/-.git

git push -u origin main

…或从命令行推送现有存储库

git remote add origin https://github.com/Yanyuyuv/-.git

git branch -M main

git push -u origin main

…或从另一个存储库导入代码

您可以使用 Subversion、Mercurial 或 TFS 项目中的代码初始化此存储库。