# 演示deltaspike如何控制类和方法的访问权限

基本的步骤是：

1, 使用@SecurityBindingType定义用于权限控制的注解
2, 使用第一步定义的注解作为qualifiers，联合@Secures定义逻辑处理方法
3, 在希望权限控制的方法和类上面使用第一步定义的注解即可。


需要注意的是，这个例子中演示的方法不能控制页面的访问权限。页面访问权限的控制方法参见例子security-page-access-control

